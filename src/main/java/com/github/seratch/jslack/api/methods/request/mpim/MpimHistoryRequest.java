package com.github.seratch.jslack.api.methods.request.mpim;

import com.github.seratch.jslack.api.methods.SlackApiRequest;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MpimHistoryRequest implements SlackApiRequest {

    private String token;
    private String channel;
    private String latest;
    private String oldest;
    private Integer inclusive;
    private Integer count;
    private Integer unreads;
}