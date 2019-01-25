/*
 *To change this license header, choose License Headers in Project Properties.
 *To change this template file, choose Tools | Templates
 *and open the template in the editor.
 */

package repository;


import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Ekta Tank
 * @since 21 Jan, 2019
 * @version 1.0.0
 */
public interface PersonRepository <P> extends CrudRepository<Person, Long>{

}
 