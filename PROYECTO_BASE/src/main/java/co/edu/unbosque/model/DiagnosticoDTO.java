package co.edu.unbosque.model;

import java.time.LocalDate;

public class DiagnosticoDTO {
	
	private int rapPaciente;
	private String prestacion;
	private String idDocumento;
	private String estudio;
	private LocalDate fechaEstudio;
	private int edadFechaEstudio;
	private char sexo;
	private Boolean nodulos;
	private String morfologiaNodulos;
	private String margenesNodulos;
	private String densidadNodulos;
	private Boolean presenciaMicrocalcificaciones;
	private String calcifiTipBenig;
	private String calcifiMorSos;
	private String distriCalcifi;
	private Boolean presenciaAsimetrias;
	private String tipoAsimetria;
	private String hallasgosAsociados;
	private String lateralidadHallasgo;
	private int BIRADS;
	private int irapPaciente;
	private int edad;
	
	public DiagnosticoDTO(int rapPaciente, String prestacion, String idDocumento, String estudio,
			LocalDate fechaEstudio, int edadFechaEstudio, char sexo, Boolean nodulos, String morfologiaNodulos,
			String margenesNodulos, String densidadNodulos, Boolean presenciaMicrocalcificaciones,
			String calcifiTipBenig, String calcifiMorSos, String distriCalcifi, Boolean presenciaAsimetrias,
			String tipoAsimetria, String hallasgosAsociados, String lateralidadHallasgo, int bIRADS, int irapPaciente,
			int edad) {
		this.rapPaciente = rapPaciente;
		this.prestacion = prestacion;
		this.idDocumento = idDocumento;
		this.estudio = estudio;
		this.fechaEstudio = fechaEstudio;
		this.edadFechaEstudio = edadFechaEstudio;
		this.sexo = sexo;
		this.nodulos = nodulos;
		this.morfologiaNodulos = morfologiaNodulos;
		this.margenesNodulos = margenesNodulos;
		this.densidadNodulos = densidadNodulos;
		this.presenciaMicrocalcificaciones = presenciaMicrocalcificaciones;
		this.calcifiTipBenig = calcifiTipBenig;
		this.calcifiMorSos = calcifiMorSos;
		this.distriCalcifi = distriCalcifi;
		this.presenciaAsimetrias = presenciaAsimetrias;
		this.tipoAsimetria = tipoAsimetria;
		this.hallasgosAsociados = hallasgosAsociados;
		this.lateralidadHallasgo = lateralidadHallasgo;
		BIRADS = bIRADS;
		this.irapPaciente = irapPaciente;
		this.edad = edad;
	}
	public int getRapPaciente() {
		return rapPaciente;
	}
	
	public void setRapPaciente(int rapPaciente) {
		this.rapPaciente = rapPaciente;
	}
	
	public String getPrestacion() {
		return prestacion;
	}
	
	public void setPrestacion(String prestacion) {
		this.prestacion = prestacion;
	}
	
	public String getIdDocumento() {
		return idDocumento;
	}
	
	public void setIdDocumento(String idDocumento) {
		this.idDocumento = idDocumento;
	}
	
	public String getEstudio() {
		return estudio;
	}
	
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
	public LocalDate getFechaEstudio() {
		return fechaEstudio;
	}
	
	public void setFechaEstudio(LocalDate fechaEstudio) {
		this.fechaEstudio = fechaEstudio;
	}
	
	public int getEdadFechaEstudio() {
		return edadFechaEstudio;
	}
	
	public void setEdadFechaEstudio(int edadFechaEstudio) {
		this.edadFechaEstudio = edadFechaEstudio;
	}
	
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public Boolean getNodulos() {
		return nodulos;
	}
	
	public void setNodulos(Boolean nodulos) {
		this.nodulos = nodulos;
	}
	
	public String getMorfologiaNodulos() {
		return morfologiaNodulos;
	}
	
	public void setMorfologiaNodulos(String morfologiaNodulos) {
		this.morfologiaNodulos = morfologiaNodulos;
	}
	
	public String getMargenesNodulos() {
		return margenesNodulos;
	}
	
	public void setMargenesNodulos(String margenesNodulos) {
		this.margenesNodulos = margenesNodulos;
	}
	
	public String getDensidadNodulos() {
		return densidadNodulos;
	}
	
	public void setDensidadNodulos(String densidadNodulos) {
		this.densidadNodulos = densidadNodulos;
	}
	
	public Boolean getPresenciaMicrocalcificaciones() {
		return presenciaMicrocalcificaciones;
	}
	
	public void setPresenciaMicrocalcificaciones(Boolean presenciaMicrocalcificaciones) {
		this.presenciaMicrocalcificaciones = presenciaMicrocalcificaciones;
	}
	
	public String getCalcifiTipBenig() {
		return calcifiTipBenig;
	}
	
	public void setCalcifiTipBenig(String calcifiTipBenig) {
		this.calcifiTipBenig = calcifiTipBenig;
	}
	
	public String getCalcifiMorSos() {
		return calcifiMorSos;
	}
	
	public void setCalcifiMorSos(String calcifiMorSos) {
		this.calcifiMorSos = calcifiMorSos;
	}
	
	public String getDistriCalcifi() {
		return distriCalcifi;
	}
	
	public void setDistriCalcifi(String distriCalcifi) {
		this.distriCalcifi = distriCalcifi;
	}
	
	public Boolean getPresenciaAsimetrias() {
		return presenciaAsimetrias;
	}
	
	public void setPresenciaAsimetrias(Boolean presenciaAsimetrias) {
		this.presenciaAsimetrias = presenciaAsimetrias;
	}
	
	public String getTipoAsimetria() {
		return tipoAsimetria;
	}
	
	public void setTipoAsimetria(String tipoAsimetria) {
		this.tipoAsimetria = tipoAsimetria;
	}
	
	public String getHallasgosAsociados() {
		return hallasgosAsociados;
	}
	
	public void setHallasgosAsociados(String hallasgosAsociados) {
		this.hallasgosAsociados = hallasgosAsociados;
	}
	
	public String getLateralidadHallasgo() {
		return lateralidadHallasgo;
	}
	
	public void setLateralidadHallasgo(String lateralidadHallasgo) {
		this.lateralidadHallasgo = lateralidadHallasgo;
	}
	
	public int getBIRADS() {
		return BIRADS;
	}
	
	public void setBIRADS(int bIRADS) {
		BIRADS = bIRADS;
	}
	
	public int getIrapPaciente() {
		return irapPaciente;
	}
	
	public void setIrapPaciente(int irapPaciente) {
		this.irapPaciente = irapPaciente;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}