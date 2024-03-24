# Benchmarks

### Results

Execution time per 10 million operations

Case | Time
------ | ------
Without decorators | 1.312s
With 1 decorator | 1.499s
With 2 decorators | 2.316s
With 10 decorators | 8.861s

Machine: Apple M2, macOS Ventura

### Usage

To build Java project:
```bash
$ make build
```

To run Java benchmarks locally:
```bash
$ make run
```
