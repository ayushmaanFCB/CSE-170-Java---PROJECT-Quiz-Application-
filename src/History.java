import javax.swing.*;
import java.awt.*;

public class History {

    MyFrame frame = new MyFrame();
    String[] q1 = {"1.   Which state was the first victim of the British policy of ‘Subsidiary Alliance‘ ?",
            "Awadh", "Mewar", "Mysore", "Hyderabad"};
    String[] q2 = {"2.   The first successful printing press was developed by :",
            "Johannes Gutenberg", "Benjamin Franklin", "Martin Luther", "Henry David Thoreau"};
    String[] q3 = {"3.   Who was the first Western explorer to reach China?",
            "Magellan", "Cook", "Marco Polo", "Sir Francis Drake"};
    String[] q4 = {"4.   Which of the following Vedas is sometimes referred as ‘the Veda of magical formulas‘ ?",
            "Rig-Veda", "Samveda", "Yajurveda", "Atharvaveda"};
    String[] q5 = {"5.   The disease that killed a third of European population in the 14th century is known as: ",
            "The White Death", "The Black Plague", "Smallpox", "The Bubonic Plague"};

    JRadioButton b11 = new JRadioButton(q1[1]);     JRadioButton b12 = new JRadioButton(q1[2]);
    JRadioButton b13 = new JRadioButton(q1[3]);     JRadioButton b14 = new JRadioButton(q1[4]);

    JRadioButton b21 = new JRadioButton(q2[1]);     JRadioButton b22 = new JRadioButton(q2[2]);
    JRadioButton b23 = new JRadioButton(q2[3]);     JRadioButton b24 = new JRadioButton(q2[4]);

    JRadioButton b31 = new JRadioButton(q3[1]);     JRadioButton b32 = new JRadioButton(q3[2]);
    JRadioButton b33 = new JRadioButton(q3[3]);     JRadioButton b34 = new JRadioButton(q3[4]);

    JRadioButton b41 = new JRadioButton(q4[1]);     JRadioButton b42 = new JRadioButton(q4[2]);
    JRadioButton b43 = new JRadioButton(q4[3]);     JRadioButton b44 = new JRadioButton(q4[4]);

    JRadioButton b51 = new JRadioButton(q5[1]);     JRadioButton b52 = new JRadioButton(q5[2]);
    JRadioButton b53 = new JRadioButton(q5[3]);     JRadioButton b54 = new JRadioButton(q5[4]);

    void history() {

        frame.setVisible(true);
        frame.setSize(980, 600);
        frame.setLayout(new BorderLayout());

        JPanel headingPanel = new JPanel();
        headingPanel.setBackground(Color.BLACK);
        JLabel heading = new JLabel("H  I  S  T  O  R  Y");
        heading.setFont(new Font("Alien Encounters", Font.BOLD, 50));
        heading.setForeground(Color.CYAN);
        heading.setHorizontalAlignment(JLabel.CENTER);
        headingPanel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 8));
        headingPanel.add(heading);
        frame.add(headingPanel, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setBackground(Color.CYAN);
        panel.setLayout(new GridLayout(6, 0));

        JPanel qpanel1 = new JPanel();
        qpanel1.setLayout(new GridLayout(2, 0));
        qpanel1.setBackground(Color.CYAN);
        qpanel1.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel ques1 = new JLabel(q1[0]);
        ques1.setFont(new Font("Deneane", Font.BOLD, 22));
        qpanel1.add(ques1);
        ButtonGroup b1Grp = new ButtonGroup();
        JPanel answerPanel1 = new JPanel();
        answerPanel1.setLayout(new GridLayout(4, 0));
        JRadioButton[] b1 = {b11, b12, b13, b14};
        for (JRadioButton button : b1) {
            button.setFont(new Font("Comic Sans", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setFocusable(false);
            b1Grp.add(button);
            answerPanel1.add(button);
        }
        qpanel1.add(answerPanel1);
        panel.add(qpanel1);

        JPanel qpanel2 = new JPanel();
        qpanel2.setLayout(new GridLayout(2, 0));
        qpanel2.setBackground(Color.CYAN);
        qpanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel ques2 = new JLabel(q2[0]);
        ques2.setFont(new Font("Deneane", Font.BOLD, 22));
        qpanel2.add(ques2);
        ButtonGroup b2Grp = new ButtonGroup();
        JPanel answerPanel2 = new JPanel();
        answerPanel2.setLayout(new GridLayout(4, 0));
        JRadioButton[] b2 = {b21, b22, b23, b24};
        for (JRadioButton button : b2) {
            button.setFont(new Font("Comic Sans", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setFocusable(false);
            b2Grp.add(button);
            answerPanel2.add(button);
        }
        qpanel2.add(answerPanel2);
        panel.add(qpanel2);

        JPanel qpanel3 = new JPanel();
        qpanel3.setLayout(new GridLayout(2, 0));
        qpanel3.setBackground(Color.CYAN);
        qpanel3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel ques3 = new JLabel(q3[0]);
        ques3.setFont(new Font("Deneane", Font.BOLD, 22));
        qpanel3.add(ques3);
        ButtonGroup b3Grp = new ButtonGroup();
        JPanel answerPanel3 = new JPanel();
        answerPanel3.setLayout(new GridLayout(4, 0));
        JRadioButton[] b3 = {b31, b32, b33, b34};
        for (JRadioButton button : b3) {
            button.setFont(new Font("Comic Sans", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setFocusable(false);
            b3Grp.add(button);
            answerPanel3.add(button);
        }
        qpanel3.add(answerPanel3);
        panel.add(qpanel3);

        JPanel qpanel4 = new JPanel();
        qpanel4.setLayout(new GridLayout(2, 0));
        qpanel4.setBackground(Color.CYAN);
        qpanel4.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel ques4 = new JLabel(q4[0]);
        ques4.setFont(new Font("Deneane", Font.BOLD, 22));
        qpanel4.add(ques4);
        ButtonGroup b4Grp = new ButtonGroup();
        JPanel answerPanel4 = new JPanel();
        answerPanel4.setLayout(new GridLayout(4, 0));
        JRadioButton[] b4 = {b41, b42, b43, b44};
        for (JRadioButton button : b4) {
            button.setFont(new Font("Comic Sans", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setFocusable(false);
            b4Grp.add(button);
            answerPanel4.add(button);
        }
        qpanel4.add(answerPanel4);
        panel.add(qpanel4);

        JPanel qpanel5 = new JPanel();
        qpanel5.setLayout(new GridLayout(2, 0));
        qpanel5.setBackground(Color.CYAN);
        qpanel5.setBorder(BorderFactory.createLineBorder(Color.BLACK, 5));
        JLabel ques5 = new JLabel(q5[0]);
        ques5.setFont(new Font("Deneane", Font.BOLD, 20));
        qpanel5.add(ques5);
        ButtonGroup b5Grp = new ButtonGroup();
        JPanel answerPanel5 = new JPanel();
        answerPanel5.setLayout(new GridLayout(4, 0));
        JRadioButton[] b5 = {b51, b52, b53, b54};
        for (JRadioButton button : b5) {
            button.setFont(new Font("Comic Sans", Font.BOLD, 20));
            button.setBackground(Color.CYAN);
            button.setFocusable(false);
            b5Grp.add(button);
            answerPanel5.add(button);
        }
        qpanel5.add(answerPanel5);
        panel.add(qpanel5);

        JScrollPane scrollPane = new JScrollPane(panel);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton submit = new JButton("Press the Button to Submit !!");
        submit.setFocusable(false);
        submit.setFont(new Font("Mael", Font.BOLD, 20));
        submit.setVerticalAlignment(JButton.CENTER);
        submit.setForeground(Color.CYAN);
        submit.setBackground(Color.BLACK);
        submit.setBorder(BorderFactory.createLineBorder(Color.CYAN,8));
        ImageIcon image = new ImageIcon("next.png");
        submit.setIcon(image);
        panel.add(submit);
        submit.addActionListener(e ->check());

        frame.back.addActionListener(e -> back());
    }

    void back() {
        ChoiceWindow choiceWindow = new ChoiceWindow();
        frame.dispose();
        choiceWindow.choices();
    }

    void check(){
        int score = 0;
        if (b14.isSelected())
            score += 20;
        if (b21.isSelected())
            score += 20;
        if (b33.isSelected())
            score += 20;
        if (b44.isSelected())
            score += 20;
        if (b54.isSelected())
            score += 20;

        frame.dispose();

        String message = "You have scored : " + score + " / 100";
        new Score().score(message, "history");
    }
}

