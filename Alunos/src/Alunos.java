public class Alunos {
	private static final boolean[] DevTrue = null;

	public static void main(String[] args) {
		
		String nome1 = "Alef Lima, "; //String é usado p guardar palavras sempre entre " "
		int idade1 = 22; //Inr é usado p armazenar numeros inteiros
		double altura1 = 1.70; //Double armazena numeros inteiros e nao inteiros
		float peso1 = 75; //Float armazena numeros inteiros e nao inteiros
		char sexo1 = 'H'; //char é usado p armazenar apena um caractere
		boolean dev1 = true; //Boolean ´s usado p guardar informações V ou F
		
		String nome2 = "Jorge Silva, ";
		int idade2 = 27;
		double altura2 = 1.75;
		double peso2 = 88;
		char sexo2 = 'H';
		boolean dev2 = false;
		
		String nome3 = "Geisa Jesus, ";
		int idade3 = 21;
		double altura3 = 1.60;
		double peso3 = 55;
		char sexo3 = 'M';
		boolean dev3 = false;
		
		String nome4 = "Alexa Silva, ";
		int idade4 = 30;
		double altura4 = 1.65;
		double peso4 = 70;
		char sexo4 = 'M';
		boolean dev4 = true;
		
		String nome5 = "Marcos Jesus";
		int idade5 = 29;
		double altura5 = 1.73;
		double peso5 = 90;
		char sexo5 = 'H';
		boolean dev5 = true;
		
		//R01
		int somaIdade;
		
		somaIdade = idade1 + idade2 + idade3 + idade4 + idade5;
		
		System.out.println("A soma das idades é: " + somaIdade);
		
		//R02
		
		String nomeAlunos;
		
		nomeAlunos = nome1 + nome2 + nome3 + nome4 + nome5;
		
		System.out.println("Os nomes dos alunos são: " + nomeAlunos);
		
		//R03
		
		double imc1 = peso1 / (altura1 * altura1);
		double imc2 = peso2 / (altura2 * altura2);
		double imc3 = peso3 / (altura3 * altura3);
		double imc4 = peso4 / (altura4 * altura4);
		double imc5 = peso5 / (altura5 * altura5);
		

		double somaImc = imc1 + imc2 + imc3 + imc4 + imc5;
		double mediaImc = somaImc / 5; 
				
		System.out.format("A média do Imc doa alunos é: %.2f", mediaImc);
		System.out.println("");
		
		//R04
		boolean[] devTrue = new boolean[5];
		devTrue[0] = dev1;
		devTrue[1] = dev2;
		devTrue[2] = dev3;
		devTrue[3] = dev4;
		devTrue[4] = dev5;
		
		int totalDevTrue = 0;
			for (int count = 0; count < 5; count++) {
				if (devTrue[count] == true) {
					totalDevTrue++;
			}
		}
		 System.out.println("A quantidade de Alunos DEVs é: " + String.valueOf(totalDevTrue));
		
		//R05
		String[] grupoNome = new String[5];
		grupoNome[0] = nome1;
		grupoNome[1] = nome2;
		grupoNome[2] = nome3;
		grupoNome[3] = nome4;
		grupoNome[4] = nome5;
		
		System.out.println("Alunos com Silva no nome: ");
		
		for (int count = 0; count < 5; count++) {
			String s1 = grupoNome[count];
			String s2 = "Silva";
			boolean b = s1.contains(s2);
			if (b == true) {
				System.out.println(grupoNome[count]);
			}
		}
	}
}
