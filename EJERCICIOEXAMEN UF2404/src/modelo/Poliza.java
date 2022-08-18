package modelo;

import java.util.Objects;

abstract class Poliza {

		protected  String idPoliza;
		protected String nombre;
		protected String apellidos;
		protected String dni;
		protected int anyo;
		protected String formaPago;
		protected double primaBase;
		protected int numSiniestroHistorico;
		
		
		public Poliza() {
			
			this.idPoliza = "";
			this.nombre = "";
			this.apellidos = "";
			this.dni = "";
			this.anyo = 2022;
			this.formaPago = "";
			this.primaBase = 0;
			this.numSiniestroHistorico = 0;
		}

				

		public Poliza(String idPoliza, String nombre, String apellidos, String dni, int anyo, String formaPago,
				double primaBase, int numSiniestroHistorico) {
			super();
			this.idPoliza = idPoliza;
			this.nombre = nombre;
			this.apellidos = apellidos;
			this.dni = dni;
			this.anyo = anyo;
			this.formaPago = formaPago;
			this.primaBase = primaBase;
			this.numSiniestroHistorico = numSiniestroHistorico;
		}

		
		
		
		public String getIdPoliza() {
			return idPoliza;
		}



		public void setIdPoliza(String idPoliza) {
			this.idPoliza = idPoliza;
		}



		public String getApellidos() {
			return apellidos;
		}



		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}



		public int getAnyo() {
			return anyo;
		}



		public void setAnyo(int anyo) {
			this.anyo = anyo;
		}



		public String getFormaPago() {
			return formaPago;
		}



		public void setFormaPago(String formaPago) {
			this.formaPago = formaPago;
		}



		public double getPrimaBase() {
			return primaBase;
		}



		public void setPrimaBase(double primaBase) {
			this.primaBase = primaBase;
		}



		public int getNumSiniestroHistorico() {
			return numSiniestroHistorico;
		}



		public void setNumSiniestroHistorico(int numSiniestroHistorico) {
			this.numSiniestroHistorico = numSiniestroHistorico;
		}



		@Override
		public String toString() {
			return "Poliza [idPoliza=" + idPoliza + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni
					+ ", anyo=" + anyo + ", formaPago=" + formaPago + ", primaBase=" + primaBase
					+ ", numSiniestroHistorico=" + numSiniestroHistorico + "]";
		}



		@Override
		public int hashCode() {
			return Objects.hash(idPoliza);
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Poliza other = (Poliza) obj;
			return Objects.equals(idPoliza, other.idPoliza);
		}

		public double calculaPrima() {
			
		}
				
		
		}
		
		
