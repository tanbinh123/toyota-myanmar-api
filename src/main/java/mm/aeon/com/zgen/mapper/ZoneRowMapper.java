package mm.aeon.com.zgen.mapper;

import java.util.List;
import mm.aeon.com.zgen.entity.ZoneRow;
import mm.aeon.com.zgen.entity.ZoneRowExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ZoneRowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    long countByExample(ZoneRowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int deleteByExample(ZoneRowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int insert(ZoneRow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int insertSelective(ZoneRow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    List<ZoneRow> selectByExampleWithRowbounds(ZoneRowExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    List<ZoneRow> selectByExample(ZoneRowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    ZoneRow selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") ZoneRow record, @Param("example") ZoneRowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") ZoneRow record, @Param("example") ZoneRowExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(ZoneRow record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table public.zone_row
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(ZoneRow record);
}