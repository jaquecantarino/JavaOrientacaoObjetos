package main;

import javax.persistence.Basic;

@Entity
@Table(name="TBL_CONTA")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name "ctitular", length = 100)
	private String titular;
	private String banco;
	private String agencia;
	private String numero;
	
	public Integer getId() {
		return id;
	}
	
}
