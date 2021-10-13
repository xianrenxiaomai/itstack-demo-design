package org.itstack.demo.design.store;

import java.util.Map;

public interface ICommodity {

    /**
     * 发奖
     * @param uId 用户唯一ID
     * @param commodityId 奖品ID 奖品编号
     * @param bizId 业务ID，防重复
     * @param extMap 扩展信息
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
