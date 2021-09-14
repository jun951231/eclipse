package shop.cofin.oracle.mappers;


import org.springframework.stereotype.Repository;

import shop.cofin.oracle.customer.domain.CustomerDto;

@Repository
public interface CustomerMapper {
	void save (CustomerDto customer);

}
