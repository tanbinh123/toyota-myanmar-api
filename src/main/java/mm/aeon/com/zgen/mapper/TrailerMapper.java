package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.Trailer;
import mm.aeon.com.zgen.entity.TrailerExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface TrailerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    long countByExample(TrailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int deleteByExample(TrailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int insert(Trailer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int insertSelective(Trailer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    List<Trailer> selectByExampleWithRowbounds(TrailerExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    List<Trailer> selectByExample(TrailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    Trailer selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Trailer record, @Param("example") TrailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Trailer record, @Param("example") TrailerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Trailer record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.trailer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Trailer record);
}