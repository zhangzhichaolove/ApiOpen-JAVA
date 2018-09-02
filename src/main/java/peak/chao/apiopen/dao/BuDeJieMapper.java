package peak.chao.apiopen.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import peak.chao.apiopen.domain.BuDeJieContent;

import java.util.List;

/**
 * Created by Chao on 2018-09-02.
 */
@Mapper
@Repository
public interface BuDeJieMapper {
    List<BuDeJieContent> selectBuDeJieContent(@Param("start") int start, @Param("count") int count);
}
