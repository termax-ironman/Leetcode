# Write your MySQL query statement below

select t.tweet_id from tweets t where
char_length(t.content) > 15