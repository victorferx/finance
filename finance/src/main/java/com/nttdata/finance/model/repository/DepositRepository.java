package com.nttdata.finance.model.repository;

import com.nttdata.finance.model.document.Deposit;
import com.nttdata.finance.model.document.PassiveAccount;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface DepositRepository extends ReactiveMongoRepository<Deposit, String> {
    Mono<Boolean> existsByPassiveAccount(PassiveAccount passiveAccount);
}
