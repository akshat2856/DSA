select w.id from Weather as w join Weather as ww on datediff(w.recordDate,ww.recordDate)=1
and w.temperature>ww.temperature;