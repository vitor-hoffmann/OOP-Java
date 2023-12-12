package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import dados.*;
import negocio.*;

public class TelaListagem implements ActionListener{
	JList<String> jlst;
	JScrollPane jscrlp;
	JButton editar, cadastrar, deletar;
	String[] nomes;
	

	public TelaListagem(String escolha, Dados a) {   
		JFrame jfrm = new JFrame("Listagem de Dados");  
		if (escolha.equals("Professor")){
			jlst = new JList<String>(a.getNomeProfessores());
			jscrlp = new JScrollPane(jlst);
			nomes = new String[a.getnProfs()];
			nomes = a.getNomeProfessores();
		}
		if (escolha.equals("Aluno")){
			jlst = new JList<String>(a.getNomeAlunos());
			jscrlp = new JScrollPane(jlst);
			nomes = new String[a.getnAlunos()];
			nomes = a.getNomeAlunos();
		}
		editar = new JButton("Editar");
		cadastrar = new JButton("Cadastrar");
		deletar = new JButton("Deletar");
		jfrm.add(editar);
		jfrm.add(cadastrar);
		jfrm.add(deletar);
		cadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if (escolha.equals("Professor")){
					jfrm.setLayout(new FlowLayout());
					editar.setVisible(false);
					deletar.setVisible(false);
					cadastrar.setVisible(false);
					jlst.setVisible(false);
					jscrlp.setVisible(false);
					JLabel nom = new JLabel("Nome: ");
					JTextField nome = new JTextField();
					JLabel idd = new JLabel("Id: ");
					JTextField id = new JTextField();
					JLabel cpff = new JLabel("Cpf: ");
					JTextField cpf = new JTextField();
					JLabel tele = new JLabel("Telefone: ");
					JTextField telefone = new JTextField();
					JLabel valora = new JLabel("Valor da Aula: ");
					JTextField valoraula = new JTextField();
					nome.setPreferredSize(new Dimension(200,30));
					id.setPreferredSize(new Dimension(200,30));
					cpf.setPreferredSize(new Dimension(200,30));
					telefone.setPreferredSize(new Dimension(200,30));
					valoraula.setPreferredSize(new Dimension(200,30));
					jfrm.add(nom);
					jfrm.add(nome);
					jfrm.add(idd);
					jfrm.add(id);
					jfrm.add(cpff);
					jfrm.add(cpf);
					jfrm.add(tele);
					jfrm.add(telefone);
					jfrm.add(valora);
					jfrm.add(valoraula);
					JButton confirmar = new JButton("Confirmar");
					jfrm.add(confirmar);
					confirmar.addActionListener(new ActionListener() {
            				public void actionPerformed(ActionEvent e){
								
            				}
        				});
				}
            }
        });
		editar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int idx = jlst.getSelectedIndex();
				if (idx != -1){
					if (escolha.equals("Professor")){

						jfrm.setLayout(new FlowLayout());
						editar.setVisible(false);
						deletar.setVisible(false);
						cadastrar.setVisible(false);
						jlst.setVisible(false);
						jscrlp.setVisible(false);
						JLabel nom = new JLabel("Nome: ");
						JTextField nome = new JTextField();
						JLabel idd = new JLabel("Id: ");
						JTextField id = new JTextField();
						JLabel cpff = new JLabel("Cpf: ");
						JTextField cpf = new JTextField();
						JLabel tele = new JLabel("Telefone: ");
						JTextField telefone = new JTextField();
						JLabel valora = new JLabel("Valor da Aula: ");
						JTextField valoraula = new JTextField();
						nome.setPreferredSize(new Dimension(200,30));
						id.setPreferredSize(new Dimension(200,30));
						cpf.setPreferredSize(new Dimension(200,30));
						telefone.setPreferredSize(new Dimension(200,30));
						valoraula.setPreferredSize(new Dimension(200,30));
						jfrm.add(nom);
						jfrm.add(nome);
						jfrm.add(idd);
						jfrm.add(id);
						jfrm.add(cpff);
						jfrm.add(cpf);
						jfrm.add(tele);
						jfrm.add(telefone);
						jfrm.add(valora);
						jfrm.add(valoraula);
						JButton confirmar = new JButton("Confirmar");
						jfrm.add(confirmar);
						
						confirmar.addActionListener(new ActionListener() {
            				public void actionPerformed(ActionEvent e){
								for (int i = 0; i < a.getnProfs(); i++){
									if (i == idx){
										String g = nome.getText();
										String b = id.getText();
										String c = cpf.getText();
										String d = telefone.getText();
										double f = Double.parseDouble(valoraula.getText());
										a.getProfessor(idx).setNome(g);
										a.getProfessor(idx).setNumID(b);
										a.getProfessor(idx).setCPF(c);
										a.getProfessor(idx).setNumTel(d);
										a.getProfessor(idx).setValorHoraAula(f);
									}
								}
								new TelaMenu(a);
								jfrm.dispose();
            				}
        				});
					}
					if (escolha.equals("Aluno")){

						jfrm.setLayout(new FlowLayout());
						editar.setVisible(false);
						deletar.setVisible(false);
						cadastrar.setVisible(false);
						jlst.setVisible(false);
						jscrlp.setVisible(false);
						JLabel nom = new JLabel("Nome: ");
						JTextField nome = new JTextField();
						JLabel idd = new JLabel("Id: ");
						JTextField id = new JTextField();
						JLabel cpff = new JLabel("Cpf: ");
						JTextField cpf = new JTextField();
						JLabel tele = new JLabel("Telefone: ");
						JTextField telefone = new JTextField();
						JLabel dtnas = new JLabel("Data de nascimento: ");
						JTextField dtnac = new JTextField();
						JLabel end = new JLabel("Endereco: : ");
						JTextField ende = new JTextField();

						nome.setPreferredSize(new Dimension(200,30));
						id.setPreferredSize(new Dimension(200,30));
						cpf.setPreferredSize(new Dimension(200,30));
						telefone.setPreferredSize(new Dimension(200,30));
						dtnac.setPreferredSize(new Dimension(200,30));
						ende.setPreferredSize(new Dimension(200,30));
						jfrm.add(nom);
						jfrm.add(nome);
						jfrm.add(idd);
						jfrm.add(id);
						jfrm.add(cpff);
						jfrm.add(cpf);
						jfrm.add(tele);
						jfrm.add(telefone);
						jfrm.add(dtnas);
						jfrm.add(dtnac);
						jfrm.add(end);
						jfrm.add(ende);
						JButton confirmar = new JButton("Confirmar");
						jfrm.add(confirmar);
						
						confirmar.addActionListener(new ActionListener() {
            				public void actionPerformed(ActionEvent e){
								for (int i = 0; i < a.getnProfs(); i++){
									if (i == idx){
										String nom = nome.getText();
										String ide = id.getText();
										String cepf = cpf.getText();
										String telef = telefone.getText();
										String nasc = dtnac.getText();
										String end = ende.getText();
										a.getAluno(idx).setNome(nom);
										a.getAluno(idx).setNumID(ide);
										a.getAluno(idx).setCPF(cepf);
										a.getAluno(idx).setNumTel(telef);
										a.getAluno(idx).setDataNasc(nasc);
										a.getAluno(idx).setEndereco(end);
									}
								}
								new TelaMenu(a);
								jfrm.dispose();
            				}
        				});
					}
				}
            }
        });
		deletar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int idx = jlst.getSelectedIndex();
				if (idx != -1){
					String[] novosNomes = new String[nomes.length - 1];
                	int j = 0;
                	for (int i = 0; i < nomes.length; i++) {
                    	if (i != idx) {
                        	novosNomes[j++] = nomes[i];
                    	}
                	}
                	nomes = novosNomes;
                	jlst.setListData(nomes);
				}
            }
        });
		
		jfrm.setLayout(new FlowLayout()); 
		jfrm.setSize(300, 300);  
		jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jscrlp.setPreferredSize(new Dimension(120, 200)); 
		jfrm.add(jscrlp); 
		jfrm.setVisible(true);  
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}










	@Override
	public void actionPerformed(ActionEvent e) {
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
	} 

}
