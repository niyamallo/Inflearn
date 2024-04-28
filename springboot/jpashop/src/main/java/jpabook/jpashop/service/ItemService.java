package jpabook.jpashop.service;

import jpabook.jpashop.domain.item.Book;
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

    /*
    save는 merge를 이용해 구현되어 있음.
    merge를 이용하면 입력하지 않은 값에 대해 DB에 null 값을 덮어쓰기 떄문에
    꼭! 변경감지를 이용해서 만들도록 하자. 일단 이 프로젝트는 save에 merge 유지
    (save를 구현한 코드를 학습용으로 보존하기 위해서 놔두겠음.)
     */
    @Transactional(readOnly = false)
    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    //변경감지를 이용한 업데이트
    @Transactional
    public void updateItem(Long itemId, String name, int price, int stockQuantity) {
        Item findItem = itemRepository.findOne(itemId);
        //트랜잭션 안에서 조회해야 영속 상태로 조회가 되고, 변경감지가 일어남.
        findItem.setName(name);
        findItem.setPrice(price);
        findItem.setStockQuantity(stockQuantity);
        //실무에서는 setter 대신
        //findItem.change(price, name, stockQuantity); 같은 식으로
        //의미있는 메서드를 만들어서 구현하자
    }

    public List<Item> findItems() {
        return itemRepository.findAll();
    }

    public Item findOne(Long itemId) {
        return itemRepository.findOne(itemId);
    }
}
