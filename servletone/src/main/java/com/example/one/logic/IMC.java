package com.example.one.logic;

public class IMC {
	
	/*final float peso; 
	final float altura;
	
	public IMC(float peso, float altura) {
		super();
		this.peso = peso;
		this.altura = altura;
	} 
	
	public float computeIMC(){
		return peso/altura/altura; 
	}*/
	

	
	public static Float parceToFloat(String strAltura){
		Float altura = null; 
		
		try{
			altura = Float.valueOf(strAltura);
		}catch(RuntimeException e){
			 e.printStackTrace(); 
		}
		return altura; 
	}
	

}
