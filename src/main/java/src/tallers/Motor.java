package tallers;

public class Motor{
	String tipo;
	int registro;
	int numerocilindros;
	void cambiarRegistro(int registro){
		this.registro = registro;
	}
	void asignarTipo(String tipo){
		if(tipo == "electrico" || tipo == "gasolina"){
			this.tipo = tipo;
		}
	}

}
