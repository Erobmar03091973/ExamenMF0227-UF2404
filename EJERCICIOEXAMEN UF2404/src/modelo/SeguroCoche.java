package modelo;

public class SeguroCoche extends Poliza {
			
	
	    String matricula;
	    int anyoCarnet;
	    
	    
	        
	    
	     public SeguroCoche(String matricula, int anyoCarnet) {
			super();
			this.matricula = "";
			this.anyoCarnet = 0;
		}


		public SeguroCoche(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
				double primaBase, int numSiniestroHistorico, String matricula, int anyoCarnet) {
			super(idPoliza, nombre, apellidos, dni, anyo, formaPago, primaBase, numSiniestroHistorico);
			this.matricula = matricula;
			this.anyoCarnet = anyoCarnet;
		}


		protected String getMatricula() {
			return matricula;
		}


		protected void setMatricula(String matricula) {
			this.matricula = matricula;
		}


		protected int getAnyoCarnet() {
			return anyoCarnet;
		}


		protected void setAnyoCarnet(int anyoCarnet) {
			this.anyoCarnet = anyoCarnet;
		}


		@Override
		public String toString() {
			return "SeguroCoche [matricula=" + matricula + ", anyoCarnet=" + anyoCarnet + ", idPoliza=" + idPoliza
					+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", anyo=" + anyo
					+ ", formaPago=" + formaPago + ", primaBase=" + primaBase + ", numSiniestroHistorico="
					+ numSiniestroHistorico + ", getMatricula()=" + getMatricula() + ", getAnyoCarnet()="
					+ getAnyoCarnet() + ", getIdPoliza()=" + getIdPoliza() + ", getApellidos()=" + getApellidos()
					+ ", getAnyo()=" + getAnyo() + ", getFormaPago()=" + getFormaPago() + ", getPrimaBase()="
					+ getPrimaBase() + ", getNumSiniestroHistorico()=" + getNumSiniestroHistorico() + ", toString()="
					+ super.toString() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + "]";
		}

		public double calculaPrima() {
			return this.saldo*Cuenta.intereses;
			if (this.saldo>cantidad+5) {
				this.saldo=this.saldo-cantidad-Cuenta.comision;
				cDestino.saldo=cDestino.saldo+cantidad;
				correcto=true;
			}
			return correcto;
		
	     
	
			
			}
						
			


		
	     
	     
}
