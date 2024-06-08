# Benchmark

![image](https://github.com/AgustinDuelli/ucse-prog2-2024-U2-Duelli/assets/130614935/4eef06c0-d92c-468c-8ac1-9d3f03f16d7c)

En las pruebas realizadas se usa el modo "thrpt", es decir que la muestra es medida según la cantidad de operaciones que pueden ser completadas por segundo.

Se puede comprobar que el procesamiento en paralelo da 7.303 operaciones por segundo en promedio, siendo más performante que el procesamiento secuencial, pero tiene una tasa de error de 2.228 operaciones por segundo a diferencia de las 0,449 del procesamiento secuencial.

Por lo tanto, se puede decir que el procesamiento en paralelo ofrece mayor cantidad de operaciones por segundo pero tiene una variabilidad mucho mayor en cuanto a su rendimiento en diferentes intentos.

Aumentando la cantidad de ejecuciones puede darse un significado estadísticamente significativo.

# Correcciones - Estado: 
## Necesarias para aprobar:
- Ejercicio 3: Hace un .get() por cada tarea, debería de utilizar otro método de CompletableFuture para poder esperar a todas las tareas juntas. Al hacer un .get() por cada tarea, éstas se ejecutan secuencialmente, incrementando en N el tiempo de ejecución dependiendo del tamaño N del input recibido. Ejecutarlas paralelamente.
- Ejercicio 4: Deben duplicar el codigo anterior, no modificarlo en el mismo archivo. El test debería de ir en la carpeta de tests. Deberían de utilizar el modo de Benchamarking AverageTime, utilizar milisegundos, y NO utilizar optimizaciones del compilador JIT (Just In Time). Para ésto deberían de utilizar el objeto BlackHole, el cual les permite tener resultados sin sesgos en cuanto a la optimización del compilador, pueden ver un ejemplo acá https://www.baeldung.com/java-microbenchmark-harness#dead-code-elimination 

## Adicionales:
- Ejercicio 1: en los tests no utliza @BeforeEach, codigo repetido.
- Deberían de actualizar el .gitignore para no incluir los archivos generados al compilar. De lo contrario se pueden pushear archivos indeseados, como la carpeta build, "hs_err_pid5148.log" y otros.
- Los tests siempre deberían de ir en el mismo package y tener la misma estructura de carpetas que en main, por lo tanto en vez de ir en test/java deberían de ir dentro de test/java/org/example