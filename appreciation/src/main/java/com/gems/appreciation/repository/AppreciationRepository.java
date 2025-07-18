package com.gems.appreciation.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gems.appreciation.entities.AppreciationDto.Appreciation;

	@Repository
	public class AppreciationRepository {

		private final NamedParameterJdbcTemplate jdbcTemplate;

	    @Autowired
	    public AppreciationRepository(NamedParameterJdbcTemplate jdbcTemplate) {
	        this.jdbcTemplate = jdbcTemplate;
	    }


	    public void save(Appreciation appreciation) {
	        String sql = "INSERT INTO appreciations (nominator_id, nominee_id, text) VALUES (:nominator, :nominee, :text)";
	        MapSqlParameterSource params = new MapSqlParameterSource()
	            .addValue("nominator", appreciation.getNominatorEmployeeId())
	            .addValue("nominee", appreciation.getNomineeEmployeeId())
	            .addValue("text", appreciation.getAppreciationText());

	        jdbcTemplate.update(sql, params);
	    }

	    public List<Appreciation> findAll() {
	        return jdbcTemplate.query("SELECT * FROM appreciations",
	            new BeanPropertyRowMapper<>(Appreciation.class));
	    }
	}
