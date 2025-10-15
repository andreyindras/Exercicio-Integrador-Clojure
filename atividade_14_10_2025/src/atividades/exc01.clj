(ns atividades.exc01)

(defn -main []
  (println "Quantos alunos na turma?")
  (let [qtd (Integer/parseInt (read-line))]
    
    (def soma 0)
    (def aprovados 0)
    
    (dotimes [i qtd]
      (println (str "\nNome do aluno " (inc i) ":"))
      (def nome (read-line))
      (println "Nota:")
      (def nota (Double/parseDouble (read-line)))

      (def conceito
        (cond
          (>= nota 90) "A"
          (>= nota 80) "B"
          (>= nota 70) "C"
          (>= nota 60) "D"
          :else "F"))

      (println (str nome " - Conceito: " conceito))

      (def soma (+ soma nota))
      (if (>= nota 60)
        (def aprovados (+ aprovados 1))))

    (def media (/ soma qtd))
    (println (str "\nMédia da turma: " media))
    (println (str "Aprovados: " aprovados))
    
    (if (>= media 80)
      (println "Desempenho geral: Turma excelente!")
      (if (>= media 60)
        (println "Desempenho geral: Bom desempenho!")
        (println "Desempenho geral: É necessário melhorar!")))))
