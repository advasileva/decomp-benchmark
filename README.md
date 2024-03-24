# Benchmarks

### Results

Execution time per 10 million operations

Case | Time
------ | ------
Without decorators | 122ms
With 1 decorator | 122ms
With 2 decorators | 127ms
With 5 decorators | 408ms
With 10 decorators | 507ms

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
