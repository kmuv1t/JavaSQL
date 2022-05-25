import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filme")
public class Movie {

	@Id
	@Column(name = "id_filme")
	private int id;

	private String titulo;
	
	private String sinopse;
	
	private String genero;
	
	private String ondeAssistir;
	
	private Boolean assistido;
	
	private Integer avaliacao;

	public Movie() {
		super();
	}

	public Movie(int id, String titulo, String sinopse, String genero, String ondeAssistir, Boolean assistido,
				 Integer avaliacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.sinopse = sinopse;
		this.genero = genero;
		this.ondeAssistir = ondeAssistir;
		this.assistido = assistido;
		this.avaliacao = avaliacao;
	}
	
	@Override
	public String toString() {
		return "Filme [id=" + id + ", titulo=" + titulo + ", sinopse=" + sinopse + ", genero=" + genero
				+ ", ondeAssistir=" + ondeAssistir + ", assistido=" + assistido + ", avaliacao=" + avaliacao + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getOndeAssistir() {
		return ondeAssistir;
	}

	public void setOndeAssistir(String ondeAssistir) {
		this.ondeAssistir = ondeAssistir;
	}

	public Boolean getAssistido() {
		return assistido;
	}

	public void setAssistido(Boolean assistido) {
		this.assistido = assistido;
	}

	public Integer getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Integer avaliacao) {
		this.avaliacao = avaliacao;
	}
	
}
