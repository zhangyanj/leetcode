select w2.Id from Weather w1,Weather w2 where w1.RecordDate = date_sub(w2.RecordDate,interval 1 day) and w2.Temperature > w1.Temperature;


