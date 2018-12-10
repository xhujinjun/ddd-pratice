// package com.github.xiejj.product.gateway.memory;
//
// import com.github.xiejj.product.domain.category.model.BackCategory;
// import com.github.xiejj.product.domain.category.model.BackSubCategory;
// import com.github.xiejj.product.domain.category.model.BackSupCategory;
// import com.github.xiejj.product.domain.category.repository.BackCategoryRepository;
//
// import java.util.ArrayList;
// import java.util.List;
// import java.util.Objects;
//
// /**
//  * @author xiejinjun
//  * @version 1.0 2018-12-09
//  */
// public class BackCategoryMapper implements BackCategoryRepository {
//     /**
//      * 模拟数据库中的数据
//      */
//     private List<BackCategory> data = new ArrayList<BackCategory>() {{
//         add(new BackSubCategory());
//         add(new BackSupCategory());
//     }};
//
//     @Override
//     public BackCategory getById(final Long brandId, final Long id) {
//         for (BackCategory backCategory : data){
//             if (Objects.equals(backCategory.getBrandId(), brandId) && Objects.equals(backCategory.getId(), id)){
//                 return backCategory;
//             }
//         }
//         return null;
//     }
//
//     @Override
//     public void save(final BackCategory backCategory) {
//
//     }
//
//     @Override
//     public void disable(final Long brandId, final Long Id) {
//
//     }
// }
