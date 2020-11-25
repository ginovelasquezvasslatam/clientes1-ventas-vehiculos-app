package pe.com.arland.cliente1.registro.entity;

public class DireccionEntity {

	private String pais;
	private String region;
	private String provincia;
	private String distrito;
	private String tipoVia;
	private String nombreVia;
	private Integer numeroVia;
	private String interiorVia;
	private String referencia;

	
	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}


	public String getProvincia() {
		return provincia;
	}


	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


	public String getDistrito() {
		return distrito;
	}


	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}


	public String getTipoVia() {
		return tipoVia;
	}


	public void setTipoVia(String tipoVia) {
		this.tipoVia = tipoVia;
	}


	public String getNombreVia() {
		return nombreVia;
	}


	public void setNombreVia(String nombreVia) {
		this.nombreVia = nombreVia;
	}


	public Integer getNumeroVia() {
		return numeroVia;
	}


	public void setNumeroVia(Integer numeroVia) {
		this.numeroVia = numeroVia;
	}


	public String getInteriorVia() {
		return interiorVia;
	}


	public void setInteriorVia(String interiorVia) {
		this.interiorVia = interiorVia;
	}


	public String getReferencia() {
		return referencia;
	}


	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}


	public DireccionEntity(String pais, String region, String provincia, String distrito, String tipoVia,
			String nombreVia, Integer numeroVia, String interiorVia, String referencia) {
		super();
		this.pais = pais;
		this.region = region;
		this.provincia = provincia;
		this.distrito = distrito;
		this.tipoVia = tipoVia;
		this.nombreVia = nombreVia;
		this.numeroVia = numeroVia;
		this.interiorVia = interiorVia;
		this.referencia = referencia;
	}
}
