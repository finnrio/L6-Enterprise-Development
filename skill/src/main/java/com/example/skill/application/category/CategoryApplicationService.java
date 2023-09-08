//package com.example.skill.application.category;
//
//import com.example.skill.application.category.interfaces.ICategoryJpaToCategoryConvertor;
//import com.example.skill.application.category.interfaces.ICategoryRepository;
//import com.example.skill.application.category.interfaces.ICategoryToCategoryJpaConvertor;
//import com.example.skill.ui.category.ICategoryApplicationService;
//import lombok.AllArgsConstructor;
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Propagation;
//import org.springframework.transaction.annotation.Transactional;
//import org.springframework.transaction.event.TransactionPhase;
//import org.springframework.transaction.event.TransactionalEventListener;
//
//import java.util.logging.Logger;
//
//@AllArgsConstructor
//@Service
//public class CategoryApplicationService implements ICategoryApplicationService {
//    private ICategoryRepository categoryRepository;
//    private ICategoryToCategoryJpaConvertor categoryToCategoryJpaConvertor;
//    private ICategoryJpaToCategoryConvertor categoryJpaToCategoryConvertor;
//    private final Logger LOG = (Logger) LoggerFactory.getLogger(getClass());
//
//    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
//    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    public void handle(NewOrd)
//}
