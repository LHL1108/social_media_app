package com.imooc.reader.service;

import com.imooc.reader.entity.Evaluation;

import java.util.List;
import java.util.Map;

public interface EvaluationService {
    public List<Map> selectByBookId(Long bookId);

    public Evaluation evaluate(Long memberId ,Long bookId, Integer score, String content);

    public Evaluation enjoy(Long evaluationId);
}
