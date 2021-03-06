package com.anhtuan.store.service;

import com.anhtuan.store.dto.request.CategoryAddDto;
import com.anhtuan.store.dto.request.CategorySearchDto;
import com.anhtuan.store.dto.request.ProductSearchRqDto;
import com.anhtuan.store.dto.response.CategoryResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.function.Predicate;

public interface CategoryService {
    List<CategoryResponseDto> getAll(CategorySearchDto searchDto);

    Page<CategoryResponseDto> search(@RequestParam CategorySearchDto categorySearchDto, Pageable pageable);

    CategoryResponseDto findById(Integer id);

    void add(CategoryAddDto dto);

    void edit(CategoryAddDto dto, Integer id);

    void delete(Integer id);

    void updateEnableFlag(Integer categoryId, Integer status);
}
