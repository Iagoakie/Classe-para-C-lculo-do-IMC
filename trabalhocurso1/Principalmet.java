package trabalhocurso1;

public class Principalmet {

	public static void main(String[] args) {
		
		Paciente Jonas = new Paciente (1.70,40);
		Paciente Bruno = new Paciente (1.80,60);
		Paciente Carlos = new Paciente (1.60,75);
		
		
		
		System.out.println("\n#### Cálculo IMC ####");
		System.out.println(" IMC do Jonas é : "+Jonas.calcularIMC());
		System.out.println(" IMC do Bruno é : "+Bruno.calcularIMC());
		System.out.println(" IMC do Carlos é : "+Carlos.calcularIMC());
		
		System.out.println("--------------------------------------");
		
		System.out.println("\n#### Diagnóstico ####");
		System.out.println("Diagnóstico do Jonas é : "+Jonas.diagnostico());
		System.out.println("Diagnóstico do Bruno é : "+Bruno.diagnostico());
		System.out.println("Diagnóstico do Calor é : "+Carlos.diagnostico());
		
		
		
		
		
		
		
		
		
		
	}

}
