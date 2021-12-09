package unirios.prova.dao;

import java.util.List;

import unirios.prova.dao.PessoaDao;
import unirios.prova.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);

	void update(Pessoa pessoa);

	void delete(Long id);

	Pessoa findById(Long id);

	List<Pessoa> findAll();

}
