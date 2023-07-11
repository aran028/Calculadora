package Controlador;

//Tiene la logica de nuestra aplicación
public class ControladorCalculadora {
	
	private Double numeroUno;
	private Double numeroDos;
	private String operacion;
	
	
	//Constructor
	public ControladorCalculadora() {
	
	}
	
	//Getters & Setters
	
	public Double getNumeroUno() {
		return numeroUno;
	}


	public void setNumeroUno(Double numeroUno) {
		this.numeroUno = numeroUno;
	}


	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	public Double getNumeroDos() {
		return numeroDos;
	}


	public void setNumeroDos(Double numeroDos) {
		this.numeroDos = numeroDos;
	}
	
	public Double sumar(Double numeroUno, Double numeroDos) {		
		return (numeroUno+numeroDos);
	}
	
	public Double restar(Double numeroUno, Double numeroDos) {		
		return (numeroUno-numeroDos);
	}
	
	public Double multiplicar(Double numeroUno, Double numeroDos) {		
		return (numeroUno*numeroDos);
	}
	
	public Double dividir(Double numeroUno, Double numeroDos) {		
		return (numeroUno/numeroDos);
	}
	
	
	
	
	
	
	

}
