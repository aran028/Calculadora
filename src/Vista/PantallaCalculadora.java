package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ControladorCalculadora;

import javax.swing.JTextField;
import java.awt.Color;

//Esto es una prueba
public class PantallaCalculadora extends JFrame {

	private JPanel contentPane;
	private JTextField consola;
	private ControladorCalculadora controlador;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		PantallaCalculadora frame = new PantallaCalculadora();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public PantallaCalculadora() {
		setTitle("Mi Calculadora");
		
		//Creamos objeto
		 controlador=new ControladorCalculadora();		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 128, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnNewButton, consola.getText());
			}
		});
		btnNewButton.setBounds(237, 22, 89, 23);
		contentPane.add(btnNewButton);
		
		consola = new JTextField();
		consola.setEditable(false);
		consola.setBounds(36, 23, 191, 20);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JButton botonSiete = new JButton("7");
		botonSiete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"7");
			}
		});
		botonSiete.setBounds(36, 98, 53, 23);
		contentPane.add(botonSiete);
		
		JButton botonOcho = new JButton("8");
		botonOcho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"8");
			}
		});
		botonOcho.setBounds(99, 98, 53, 23);
		contentPane.add(botonOcho);
		
		JButton botonNueve = new JButton("9");
		botonNueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"9");
			}
		});
		botonNueve.setBounds(162, 98, 53, 23);
		contentPane.add(botonNueve);
		
		JButton botonCuatro = new JButton("4");
		botonCuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"4");
			}
		});
		botonCuatro.setBounds(36, 132, 53, 23);
		contentPane.add(botonCuatro);
		
		JButton btoonCinco = new JButton("5");
		btoonCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"5");
			}
		});
		btoonCinco.setBounds(99, 132, 53, 23);
		contentPane.add(btoonCinco);
		
		JButton botonSeis = new JButton("6");
		botonSeis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"6");
			}
		});
		botonSeis.setBounds(162, 132, 53, 23);
		contentPane.add(botonSeis);
		
		JButton botonUno = new JButton("1");
		botonUno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"1");
			}
		});
		botonUno.setBounds(36, 166, 53, 23);
		contentPane.add(botonUno);
		
		JButton botonDos = new JButton("2");
		botonDos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"2");
			}
		});
		botonDos.setBounds(99, 166, 53, 23);
		contentPane.add(botonDos);
		
		JButton botonTres = new JButton("3");
		botonTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(consola.getText()+"3");
			}
		});
		botonTres.setBounds(162, 166, 53, 23);
		contentPane.add(botonTres);
		
		JButton botonCero = new JButton("0");
		botonCero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
									consola.setText(consola.getText()+"0");
		
			}				
			
		});
		botonCero.setBounds(36, 196, 53, 23);
		contentPane.add(botonCero);
		
		consola = new JTextField();
		consola.setBounds(56, 24, 171, 19);
		contentPane.add(consola);
		consola.setColumns(10);
		
		JButton botonPunto = new JButton(".");
		botonPunto.setBounds(99, 197, 53, 23);
		contentPane.add(botonPunto);
		
		JButton botonSuma = new JButton("+");
		botonSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Almaceno el valor del primer numero 
				controlador.setNumeroUno(Double.parseDouble(consola.getText()));		
				//Borro el NumeroUno
				consola.setText("");
				controlador.setOperacion("Suma");
			}
		});
		botonSuma.setBounds(237, 99, 53, 23);
		contentPane.add(botonSuma);
		
		JButton botonResta = new JButton("-");
		botonResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Almaceno el valor del primer numero 
				controlador.setNumeroUno(Double.parseDouble(consola.getText()));		
				//Borro el NumeroUno
				consola.setText("");
				controlador.setOperacion("Resta");			
			}
		});
		botonResta.setBounds(237, 133, 53, 23);
		contentPane.add(botonResta);
		
		JButton botonMultiplicacion = new JButton("*");
		botonMultiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Almaceno el valor del primer numero 
				controlador.setNumeroUno(Double.parseDouble(consola.getText()));		
				//Borro el NumeroUno
				consola.setText("");
				controlador.setOperacion("Multiplicacion");				
			}
		});
		botonMultiplicacion.setBounds(237, 166, 53, 23);
		contentPane.add(botonMultiplicacion);
		
		JButton botonDivision = new JButton("/");
		botonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Almaceno el valor del primer numero 
				controlador.setNumeroUno(Double.parseDouble(consola.getText()));		
				//Borro el NumeroUno
				consola.setText("");
				controlador.setOperacion("Division");				
				
			}
		});
		botonDivision.setBounds(237, 197, 53, 23);
		contentPane.add(botonDivision);
		
		JButton botonIgual = new JButton("=");
		botonIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
								
				
				//Almaceno el valor del numero 2
				controlador.setNumeroDos(Double.parseDouble(consola.getText()));	
				//Borro el NumeroUno
				consola.setText(" ");
				if (controlador.getOperacion()=="Suma") {
					consola.setText(String.valueOf(controlador.sumar(controlador.getNumeroUno(),controlador.getNumeroDos())));					
				}	
				if (controlador.getOperacion()=="Resta") {
					consola.setText(String.valueOf(controlador.restar(controlador.getNumeroUno(),controlador.getNumeroDos())));					
				}
				if (controlador.getOperacion()=="Multiplicacion") {
					consola.setText(String.valueOf(controlador.multiplicar(controlador.getNumeroUno(),controlador.getNumeroDos())));					
				}	
				if (controlador.getOperacion()=="Division") {
					consola.setText(String.valueOf(controlador.dividir(controlador.getNumeroUno(),controlador.getNumeroDos())));					
				}	
				
				
				
				
			}
		});
		botonIgual.setBounds(237, 66, 53, 23);
		contentPane.add(botonIgual);
		
		//Botón para borrar
		JButton botonC = new JButton("C");
		botonC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				consola.setText(" ");
			}
		});
		botonC.setBounds(162, 67, 53, 23);
		contentPane.add(botonC);
		
		
		botonPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Si el texto no contiene un punto
				if(!consola.getText().contains(".")) {	
					if(consola.getText().isEmpty()) {
						consola.setText("0.");//Si está vacio
					}
					else {
						consola.setText(consola.getText()+".");
					}	
			}
				
			}
		});
	}//public Calculadora
}

