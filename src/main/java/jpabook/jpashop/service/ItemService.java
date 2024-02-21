package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Item;
import jpabook.jpashop.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    @Transactional
    private void save(Item item) {
        itemRepository.save(item);
    }

    private List<Item> findItems() {
        return itemRepository.findAll();
    }

    private Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}
