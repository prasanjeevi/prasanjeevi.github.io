# Notables

## Web
- https://developer.mozilla.org/en-US/docs/Learn
- https://docs.emmet.io/cheat-sheet/

### HTML
- https://developer.mozilla.org/en-US/docs/Web/HTML
- https://developer.mozilla.org/en-US/docs/Web/Guide/HTML/HTML5
- https://www.wpkube.com/html5-cheat-sheet

# ticks

## Notes from [exceptionnotfound](https://exceptionnotfound.net)
>  Concepts have a longer shelf life than details, because details change. Languages are born and die, frameworks become unpopular overnight, companies go out of business, support will end. But the thoughts, the ideas, the best practices? They live forever.

> It doesn't matter what framework you like, what stack you use, what technology you're currently in love with. Just pick one, learn that, master that.

> Code is ephemeral, concepts are eternal. Code is static; it will die, fall apart, degrade. It may take a long time, years or decades, but it will happen. But the concepts which programming lives off of do not die; they live on.

- [ ] Read and follow exceptionnotfound
  - https://github.com/exceptionnotfound
  - https://exceptionnotfound.net/code-is-ephemeral-concepts-are-eternal/
  - https://exceptionnotfound.net/decimal-vs-double-and-other-tips-about-number-types-in-net/
    - https://projects.ncsu.edu/labwrite/Experimental%20Design/accuracyprecision.htm
- [ ] Markdown
- [ ] GFM
- [ ] https://projects.ncsu.edu/labwrite/Experimental%20Design/accuracyprecision.htm

- WebApi [HttpGet("[action]")]
- Linq OrderBy
- NPOI Excel Reading

```
$ - String interpolation
@ - String verbatim
{0} - Composite formatting
string message = $"I am {username}, {age} year{(age == 1 ? "" : "s")} old";

Should have any white space between the $ and the " that starts the string. Doing so causes a compile-time error.
The $ token must appear before the @ token in a verbatim interpolated string.
```

```
for(let code=0;code<256;code++)console.log(code, String.fromCharCode(code))
```

```
using Newtonsoft.Json.Converters;
[JsonConverter(typeof(DateFormatConverter), "yyyy-MM-dd")]
public DateTime MaturityDate { get; set; }

public class DateFormatConverter : IsoDateTimeConverter
{
    public DateFormatConverter(string format)
    {
        base.DateTimeFormat = format;
    }
}
```

```
table{
  table-layout: fixed;
  width: 100%;
  border-collapse: collapse;
}
td {
  overflow: hidden;
  white-space: nowrap;
  text-overflow: ellipsis;
  border: 1px dashed grey;
}
td:hover {
  text-overflow: clip;
  white-space: normal;
  word-break: break-all;
}
```
