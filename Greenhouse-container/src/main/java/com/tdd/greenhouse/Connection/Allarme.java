package com.tdd.greenhouse.Connection;

public abstract class Allarme {

		private int idAmbiente;
		protected String mex;
		private String tipoColtivazione;
		private int idColt;
		private int idSez;
		
		protected Allarme(){}
		
		protected Allarme(int id)
		{
			idAmbiente = id;
		}
		
		public int getSensoreMalfunzionante()		//-1 nessuno , 1 temp ,2 umi , 3 irr
		{
			return -1;
		}
		
		public int getIdAmbiente() {
			return idAmbiente;
		}
		public String getMex() {
			return mex;
		}

		public String getTipoColtivazione() {
			return tipoColtivazione;
		}
		public void setTipoColtivazione(String tipo) {
			this.tipoColtivazione = tipo;
		}
		public int getIdColt() {
			return idColt;
		}
		public void setIdColt(int idColt) {
			this.idColt = idColt;
		}
		public int getIdSez() {
			return idSez;
		}
		public void setIdSez(int idSez) {
			this.idSez = idSez;
		}
		
}
