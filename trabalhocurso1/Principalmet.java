package trabalhocurso1;

public class Principalmet {

	public static void main(String[] args) {
		
		Paciente Jonas = new Paciente (1.70,40);
		Paciente Bruno = new Paciente (1.80,60);
		Paciente Carlos = new Paciente (1.60,75);
		
		
		
		System.out.println("\n#### C�lculo IMC ####");
		System.out.println(" IMC do Jonas � : "+Jonas.calcularIMC());
		System.out.println(" IMC do Bruno � : "+Bruno.calcularIMC());
		System.out.println(" IMC do Carlos � : "+Carlos.calcularIMC());
		
		System.out.println("--------------------------------------");
		
		System.out.println("\n#### Diagn�stico ####");
		System.out.println("Diagn�stico do Jonas � : "+Jonas.diagnostico());
		System.out.println("Diagn�stico do Bruno � : "+Bruno.diagnostico());
		System.out.println("Diagn�stico do Calor � : "+Carlos.diagnostico());
		
		
		
		
		
		
		
		
		
		
	}

}
