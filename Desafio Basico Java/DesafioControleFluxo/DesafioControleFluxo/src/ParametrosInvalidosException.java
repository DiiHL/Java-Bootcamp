public class ParametrosInvalidosException extends Exception {

	public static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			//teste se o numero dois é maior que o um, se nao lançar exception
			throw new ParametrosInvalidosException();


		}
		
		int contar = parametroDois - parametroUm;
		//contagem de numeros

		for(int x = 0 ; x <= contar; x++){
			System.out.println("Primeiro numero: " +x);
		}

	}

}



