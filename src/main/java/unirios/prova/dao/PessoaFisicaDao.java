package unirios.prova.dao;

import java.util.List;

import unirios.prova.dao.PessoaFisicaDao;
import unirios.prova.domain.PessoaFisica;

public interface PessoaFisicaDao {

	void save(PessoaFisica pessoafisica);

	void update(PessoaFisica pessoafisica);

	void delete(Long id);

	PessoaFisica findById(Long id);

	List<PessoaFisica> findAll();

}
