package br.com.stack.test;

import br.com.stack.java.MinhaException;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        	metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaException ex){
        	String msg = ex.getMessage();
        	System.out.println("Exception " + msg);
        	ex.printStackTrace();
        	
        }
        finally {
        	System.out.println("com erro ou não. isso será impresso"); // o finally é opcional e pode haver
        															   //blocos apenas com try e finally, sem o catch
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException{ /* esse "throws" só será usado quando 
    													a exception extender diretamente a class exception e n a RuntimeException */
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException{
        System.out.println("Ini do metodo2");
        //for(int i = 1; i <= 5; i++) {
            //System.out.println(i);
            //int a = i / 0;
            //Conta conta = null;
            //conta.deposita();
        //}
        //throw new ArithmeticException("Arithmetic");
        throw new MinhaException("algo deu mt errado");
        
        //System.out.println("Fim do metodo2");        
    }
}
