package service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by keisogaw on 2017/09/11.
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataResource {
    /**
     * ユーザーID
     */
    private String userId;
    /**
     * ユーザーアカウント
     */
    private String userAccount;
}
