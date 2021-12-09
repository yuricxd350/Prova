package unirios.prova.dao;

import java.util.List;

import unirios.prova.dao.PessoaJuridicaDao;
import unirios.prova.domain.PessoaJuridica;

public interface PessoaJuridicaDao {

	void save(PessoaJuridica pessoajuridica);

	void update(PessoaJuridica pessoajuridica);

	void delete(Long id);

	PessoaJuridica findById(Long id);

	List<PessoaJuridica> findAll();

}
