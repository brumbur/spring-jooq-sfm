SELECT row_to_json(t) FROM (

SELECT * FROM actor a, film f, film_actor fa
WHERE a.actor_id = fa.actor_id
AND f.film_id = fa.film_id

) t