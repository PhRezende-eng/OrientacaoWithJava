
public class FiguraRegular {

	float lado; 

	static float raiz3 = (float) Math.sqrt(3);

	public FiguraRegular(float lado) {
		this.lado = lado; 
	}


	public float calcularArea() {
		return lado * lado; 
	}


	public float calcularPerimetro() {
		return 4 * lado; 
	}

}