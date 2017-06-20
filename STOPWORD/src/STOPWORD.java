
import java.io.*;
import java.util.StringTokenizer;
import jdk.jfr.events.FileWriteEvent;

public class STOPWORD extends javax.swing.JFrame {

    public STOPWORD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        BTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXTB = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        TXTA = new javax.swing.JTextPane();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STOP WORD REMOVAL");
        setPreferredSize(new java.awt.Dimension(800, 800));

        BTN.setText("CONVERT");
        BTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNMouseClicked(evt);
            }
        });

        TXTB.setText("Converted Text");
        TXTB.setPreferredSize(new java.awt.Dimension(101, 50));
        jScrollPane1.setViewportView(TXTB);

        TXTA.setText("Enter The text here");
        TXTA.setPreferredSize(new java.awt.Dimension(101, 50));
        jScrollPane2.setViewportView(TXTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 750, Short.MAX_VALUE)
                .addComponent(BTN)
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 839, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
                .addComponent(BTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 381, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNMouseClicked
        int ch;
        try {
            String sh;
            BufferedWriter nf = new BufferedWriter(new FileWriter("F:\\Conversion1.txt"));
            System.out.println(TXTA.getText());
            TXTA.write(nf);
            nf.close();
            FileReader fr = new FileReader("F:\\Conversion1.txt");
            FileWriter fw = new FileWriter("F:\\Conversion2.txt");
            while ((ch = fr.read()) != -1) {
                if ((char) ch == ' ') {
                    fw.write(';');
                } else {
                    fw.write((char) ch);
                }
            }
            fr.close();
            fw.close();
            BufferedReader fr1 = new BufferedReader(new FileReader("F:\\Conversion2.txt"));
            BufferedWriter fw1 = new BufferedWriter(new FileWriter("F:\\Conversion3.txt"));
            String line;
            while ((line = fr1.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(line, ";");
                while (st.hasMoreTokens()) {

                    String s = st.nextToken();

                    int i;
                    boolean ans = true;
                    String A[] = {"a", "able", "about", "above", "according", "accordingly", "across", "actually", "after", "afterwards", "again", "against", "ain’t", "all", "allow", "allows", "almost", "alone", "along", "already", "also", "although", "always", "am", "among", "amongst", "an", "and", "another", "any", "anybody", "anyhow", "anyone", "anything", "anyway", "anyways", "anywhere", "apart", "appear", "appreciate", "appropriate", "are", "aren’t", "around", "as", "aside", "ask", "asking", "associated", "at", "available", "away", "awfully", "be", "became", "because", "become", "becomes", "becoming", "been", "before", "beforehand", "behind", "being", "believe", "below", "beside", "besides", "best", "better", "between", "beyond", "both", "brief", "but", "by", "common", "came", "can", "can’t", "cannot", "cant", "cause", "causes", "certain", "certainly", "changes", "clearly", "co", "com", "come", "comes", "concerning", "consequently", "consider", "considering", "contain", "containing", "contains", "corresponding", "could", "couldn’t", "course", "currently d definitely", "described", "despite", "did", "didn’t", "different", "do", "does", "doesn’t", "doing", "don’t", "done", "down", "downwards", "during", "each", "edu", "eg", "eight", "either", "else", "elsewhere", "enough", "entirely", "especially", "et", "etc", "even", "ever", "every", "everybody", "everyone", "everything", "everywhere", "ex", "exactly", "example", "except", "far", "few", "fifth", "first", "five", "followed", "following", "follows", "for", "former", "formerly", "forth", "four", "from", "further", "furthermore", "get", "gets", "getting", "given", "gives", "go", "goes", "going", "gone", "got", "gotten", "greetings", "had", "hadn’t", "happens", "hardly", "has", "hasn't", "have", "haven't", "having", "he", "he’s", "hello", "help", "hence", "her", "here", "here’s", "hereafter", "hereby", "herein", "hereupon", "hers", "herself", "hi", "him", "himself", "his", "hither", "hopefully", "how", "howbeit", "however", "i’d", "i’ll", "i’m", "i’ve", "ie", "if", "ignored", "immediate", "in", "inasmuch", "inc", "indeed", "indicate", "indicated", "indicates", "inner", "insofar", "instead", "into", "inward", "is", "isn’t", "it", "it’d", "it’ll", "it’s", "its", "itself", "Just", "keep", "keeps", "kept", "know", "knows", "known", "last", "lately", "later", "latter", "latterly", "least", "less", "lest", "let", "let’s", "like", "liked", "likely", "little", "look", "looking", "looks", "ltd", "mainly", "many", "may", "maybe", "me", "mean", "meanwhile", "merely", "might", "more", "moreover", "most", "mostly", "much", "must", "my", "myself", "name", "namely", "nd", "near", "nearly", "necessary", "need", "needs", "neither", "never", "nevertheless", "new", "next", "nine", "no", "nobody", "none", "nor", "normally", "not", "nothing", "novel", "now", "nowhere", "obviously", "of", "off", "often", "oh", "ok", "okay", "old", "on", "once", "one", "ones", "only", "onto", "or", "other", "others", "otherwise", "ought", "our", "ours", "ourselves", "out", "outside", "over", "overall", "own", "particular", "particularly", "per", "perhaps", "placed", "please", "plus", "possible", "presumably", "probably", "provides", "que", "quite", "qv", "rather", "rd", "re", "really", "reasonably", "regarding", "regardless", "regards", "relatively", "respectively", "right", "said", "same", "saw", "say", "saying", "says", "second", "secondly", "see", "seeing", "seem", "seemed", "seeming", "seems", "seen", "self", "selves", "sensible", "sent", "serious", "seriously", "seven", "several", "shall", "she", "should", "shouldn’t", "since", "six", "so", "some", "somebody", "somehow", "someone", "something", "sometime", "sometimes", "somewhat", "somewhere", "soon", "sorry", "specified", "specify", "specifying", "still", "sub", "such", "sup", "sure", "t’s", "take", "taken", "tell", "tends", "th", "than", "thank", "thanks", "thanx", "that", "that’s", "thats", "the", "their", "theirs", "them", "themselves", "then", "thence", "there", "there’s", "thereafter", "thereby", "therefore", "therein", "theres", "thereupon", "these", "they", "they’d", "they’ll", "they’re", "they’ve", "think", "third", "this", "thorough", "thoroughly", "those", "though", "three", "through", "throughout", "thru", "thus", "to", "together", "too", "took", "toward", "towards", "tried", "tries", "truly", "try", "trying", "twice", "two", "un", "under", "unfortunately", "unless", "unlikely", "until", "unto", "up", "upon", "us", "use", "used", "useful", "uses", "using", "usually", "value", "various", "very", "via", "viz", "vs", "want", "wants", "was", "wasn’t", "way", "we", "we’d", "we’ll", "we’re", "we’ve", "welcome", "well", "went", "were", "weren’t", "what", "what’s", "whatever", "when", "whence", "whenever", "where", "where’s", "whereafter", "whereas", "whereby", "wherein", "whereupon", "wherever", "whether", "which", "while", "whither", "who", "who’s", "whoever", "whole", "whom", "whose", "why", "will", "willing", "wish", "with", "within", "without", "won’t", "wonder", "would", "would", "wouldn’t", "yes", "yet", "you", "you’d", "you’ll", "you’re", "you’ve", "your", "yours", "yourself", "yourselves", "Zero"};
                    for (i = 0; i < A.length; i++) {
                        if (s.equalsIgnoreCase(A[i])) {
                            ans = false;
                            break;
                        }
                    }
                    if (ans == true) {
                        if (s.equalsIgnoreCase("   ")) {
                            fw1.write(" ");
                        } else if (s.equalsIgnoreCase("  ")) {
                            fw1.write(" ");
                        } else if (s.equalsIgnoreCase("     ")) {
                            fw1.write(" ");
                        } else {
                            fw1.write(s + " ");
                        }
                    }
                }
            }
            fr1.close();
            fw1.close();
            BufferedReader fr4 = new BufferedReader(new FileReader("F:\\Conversion3.txt"));
            String strr, strr1 = "";
            while ((strr = fr4.readLine()) != null) {

                strr1 = strr1 + strr;
                TXTB.setText(strr1);
            }
            fr4.close();
        } catch (IOException e) {

        }

    }//GEN-LAST:event_BTNMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(STOPWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(STOPWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(STOPWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(STOPWORD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new STOPWORD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN;
    private javax.swing.JTextPane TXTA;
    private javax.swing.JTextPane TXTB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
