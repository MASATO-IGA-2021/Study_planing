package com.example.study_plan.Form;

import java.io.Serializable;
import java.util.Date;

// import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketForm implements Serializable{
    private static final long serialVersionID = 1L;

    // @NotBlank(message="必ず入力してください。"
    //@Length(max=50)
    private String title;//「チケットのタイトル」

    private String status;//「チケットのステータス」｛作成中、対応中、完了｝編集不可

    private Date createDate;//「チケット作成日」、作成ボタン押下時に日付を入力、編集不可

    // @NotBlank(message="必ず入力してください。"
    private Date doneLimitDate;//「チケットの完了期限日」、本日以降の日付
    
    // @NotBlank(message="必ず入力してください。"
    //@Length(max=256)
    private String content;//「学習内容」


    
}
