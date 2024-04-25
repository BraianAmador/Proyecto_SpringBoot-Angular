package com.bamador.crudFullstackAngular.service;

import com.bamador.crudFullstackAngular.entity.Customer;
import com.bamador.crudFullstackAngular.exception.ResourceNotFoundException;
import com.bamador.crudFullstackAngular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(Integer id){
        Customer customer =customerRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException("Customer con id " + id + " no se encuentra");
                }
        );
        return customer;
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {

        return customerRepository.save(customer);
    }
}
