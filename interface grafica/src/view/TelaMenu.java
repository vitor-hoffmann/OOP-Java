package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import dados.Dados;

public class TelaMenu implements ActionListener{
    JFrame jfrm;
    JButton gerealuno, gereprof;
    

    public TelaMenu(Dados a){
        jfrm = new JFrame("Menu");
        jfrm.setLayout(new FlowLayout());
	    jfrm.setSize(300, 300);
        gerealuno = new JButton("Gerenciar Alunos");
        gereprof = new JButton("Gerenciar Professores");
        jfrm.add(gereprof);
        jfrm.add(gerealuno);
        gerealuno.setVisible(true);
        gereprof.setVisible(true);
        jfrm.setVisible(true);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gerealuno.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                jfrm.dispose();
                new TelaListagem("Aluno", a);
            }
        });
        gereprof.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                new TelaListagem("Professor", a);
                jfrm.dispose();
            }
        });
    }









    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
