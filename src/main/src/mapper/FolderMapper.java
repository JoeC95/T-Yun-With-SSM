package mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Folder;
import po.FolderWithBLOBs;

public interface FolderMapper {

    //插入文件记录
    void addFolder(FolderWithBLOBs folderWithBLOBs) throws Exception;

}