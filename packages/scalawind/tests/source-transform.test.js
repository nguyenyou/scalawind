// THIS FILE IS FOR INTERNAL USAGE, PLEASE IGNORE THIS FILE

import { expect, test, describe } from "bun:test";
import { transformSource } from "../src/source-transform";

describe("source transform scala source", () => {
  test("case 1", () => {
    const source = `
    tw.bgRed500.p4
  `;
    const actual = transformSource(source);
    const expected = "bg-red-500 p-4";
    expect(actual).toBe(expected);
  });

  test("case 2", () => {
    const source = `
    tw.raw("bg-red-500 p-4")
  `;
    const actual = transformSource(source);
    const expected = "bg-red-500 p-4";
    expect(actual).toBe(expected);
  });

  test("case 3", () => {
    const source = `
    tw.fontSans.grid
          .gridRows_("20px_1fr_20px")
          .itemsCenter
          .justifyItemsCenter
          .minHScreen
          .p8
          .pb20
          .gap16
          .sm(tw.p20)
  `;
    const actual = transformSource(source);
    const expected =
      "font-sans grid grid-rows-[20px_1fr_20px] items-center justify-items-center min-h-screen p-8 pb-20 gap-16 sm:p-20";
    expect(actual).toBe(expected);
  });

  test("case 4", () => {
    const source = `
    tw.text_("#ff0")
    tw.flex.text_("#ff0").itemsCenter.bg_("#00f")
  `;
    const actual = transformSource(source);
    const expected = "text-[#ff0] flex items-center bg-[#00f]";
    expect(actual).toBe(expected);
  });

  test("case 5", () => {
    const source = `
    tw.text_("#ff0")
    tw.flex.text_("#ff0").itemsCenter.bg_("#00f")
  `;
    const actual = transformSource(source);
    const expected = "text-[#ff0] flex items-center bg-[#00f]";
    expect(actual).toBe(expected);
  });

  test("case 6", () => {
    const source = `
    tw.flex.flex_col.variant("&:nth-child(3)", tw.underline.flex).items_center.justify_center
  `;
    const actual = transformSource(source);
    const expected =
      "flex flex-col [&:nth-child(3)]:underline [&:nth-child(3)]:flex items-center justify-center";
    expect(actual).toBe(expected);
  });

  test("case 7", () => {
    const source = `
    tw.lg(tw.variant("&:nth-child(3)", tw.hover(tw.underline)))
  `;
    const actual = transformSource(source);
    const expected = "lg:[&:nth-child(3)]:hover:underline";
    expect(actual).toBe(expected);
  });

  test("case 8", () => {
    const source = `
    tw.variant("&:nth-child(3)", tw.underline).listDisc.mx5.textWhite
  `;
    const actual = transformSource(source);
    const expected = "[&:nth-child(3)]:underline list-disc mx-5 text-white";
    expect(actual).toBe(expected);
  });

  test("case 9", () => {
    const source = `
    tw.variant("&:nth-child(3)", tw.underline)
  `;
    const actual = transformSource(source);
    const expected = "[&:nth-child(3)]:underline";
    expect(actual).toBe(expected);
  });

  test("case 10", () => {
    const source = `
    tw.variant("&:is(.foo, .bar)", 
        tw.underline)
        .p4
  `;
    const actual = transformSource(source);
    const expected = "[&:is(.foo, .bar)]:underline p-4";
    expect(actual).toBe(expected);
  });

  test("case 11", () => {
    const source = `
    tw.important(tw.textRed400)
  `;
    const actual = transformSource(source);
    const expected = "!text-red-400";
    expect(actual).toBe(expected);
  });

  test("case 12", () => {
    const source = `
    tw.textRed400$("10")
  `;
    const actual = transformSource(source);
    const expected = "text-red-400/10";
    expect(actual).toBe(expected);
  });

  test("case 12", () => {
    const source = `
    tw.bgBlack$("[.05]")
  `;
    const actual = transformSource(source);
    const expected = "bg-black/[.05]";
    expect(actual).toBe(expected);
  });
  test("case 13", () => {
    const source = `
    tw.fontBold.textRed400$("10").bgGreen500$("20").hover(tw.textBlack)
  `;
    const actual = transformSource(source);
    const expected = "font-bold text-red-400/10 bg-green-500/20 hover:text-black";
    expect(actual).toBe(expected);
  });
  test("case 14", () => {
    const source = `
    tw.sm(tw.hover(tw.important(tw.fontBold)))
  `;
    const actual = transformSource(source);
    const expected = "sm:hover:!font-bold";
    expect(actual).toBe(expected);
  });
  test("case 15", () => {
    const source = "tw.`w_1/2`";
    const actual = transformSource(source);
    const expected = "w-1/2";
    expect(actual).toBe(expected);
  });
  test("case 16", () => {
    const source = "tw.hover(tw.`w_1/2`)";
    const actual = transformSource(source);
    const expected = "hover:w-1/2";
    expect(actual).toBe(expected);
  });
  
  test("case 17", () => {
    const source = `
      div(
        div(
          tw.my24.textCenter.text20.leading32.textGray8.wFull.fontSemiBold,
          "scalawind"
        )
      )
    `;
    const actual = transformSource(source);
    const expected = "my-24 text-center text-20 leading-32 text-gray-8 w-full font-semi-bold";
    expect(actual).toBe(expected);
  });

  test("case 17", () => {
    const source = `
      div(
        div(
          tw.flex,
          "scalawind"
        ),
        div(
          tw.itemsCenter.hover(tw.text20)
        )
      )
    `;
    const actual = transformSource(source);
    const expected = "flex items-center hover:text-20";
    expect(actual).toBe(expected);
  });

  test("case 18", () => {
    const source = `
      div(
        tw.bgRed500.p4.hover(tw.bgBlue500).md(tw.focus(tw.bgGreen500.textWhite)).flex.flexCol.gap10
      )
    `;
    const actual = transformSource(source);
    const expected = "bg-red-500 p-4 hover:bg-blue-500 md:focus:bg-green-500 md:focus:text-white flex flex-col gap-10";
    expect(actual).toBe(expected);
  });

  test("case 19", () => {
    const source = "tw.`w_1.5`";
    const actual = transformSource(source);
    const expected = "w-1.5";
    expect(actual).toBe(expected);
  });

  test("case 20", () => {
    const source = "tw.bgBlue500.hover(tw.bgBlue600).firstLetter(tw.textRed500.fontBold).textWhite.rounded.py3.px4.md(tw.py4.px5).dark(tw.bgSky900.hover(tw.bgSky800))";
    const actual = transformSource(source);
    const expected = "bg-blue-500 hover:bg-blue-600 first-letter:text-red-500 first-letter:font-bold text-white rounded py-3 px-4 md:py-4 md:px-5 dark:bg-sky-900 dark:hover:bg-sky-800";
    expect(actual).toBe(expected);
  });

  test("case 21", () => {
    const source = `
      tw.roundedFull.border.borderSolid.borderTransparent.transitionColors.flex.itemsCenter.justifyCenter.bgForeground.textBackground.gap2
          .hover(tw.bg_("#383838"))
          .dark(tw.hover(tw.bg_("#333")))
          .textSm
          .sm(tw.textBase)
          .h10
          .sm(tw.h12)
          .px4
          .sm(tw.px5)
    `
    const actual = transformSource(source);
    const expected = "rounded-full border border-solid border-transparent transition-colors flex items-center justify-center bg-foreground text-background gap-2 hover:bg-[#383838] dark:hover:bg-[#333] text-sm sm:text-base h-10 sm:h-12 px-4 sm:px-5";
    expect(actual).toBe(expected);
  });

  test("case negative value", () => {
    const source = "tw._left_1";
    const actual = transformSource(source);
    const expected = "-left-1";
    expect(actual).toBe(expected);
  });

  test("nested 1 level", () => {
    const source = `
      tw.hover(tw.bgRed500)
      tw.flex.hover(tw.bgRed500)
      tw.flex.hover(tw.bgRed500).p4
    `;
    const actual = transformSource(source);
    const expected = "hover:bg-red-500 flex p-4";
    expect(actual).toBe(expected);
  });


  test("nested 2 level", () => {
    const source = `
      tw.md(tw.hover(tw.bgRed500))
    `;
    const actual = transformSource(source);
    const expected = "md:hover:bg-red-500";
    expect(actual).toBe(expected);
  });

  test("nested 3 level", () => {
    const source = `
      tw.md(tw.hover(tw.focus(tw.bgRed500)))
    `;
    const actual = transformSource(source);
    const expected = "md:hover:focus:bg-red-500";
    expect(actual).toBe(expected);
  });

  test("nested 4 level", () => {
    const source = `
      tw.md(tw.hover(tw.focus(tw.active(tw.bgRed500))))
    `;
    const actual = transformSource(source);
    const expected = "md:hover:focus:active:bg-red-500";
    expect(actual).toBe(expected);
  });

  test("nested 5 level", () => {
    const source = `
      tw.md(tw.hover(tw.focus(tw.active(tw.groupHover(tw.bgRed500)))))
    `;
    const actual = transformSource(source);
    const expected = "md:hover:focus:active:group-hover:bg-red-500";
    expect(actual).toBe(expected);
  });

  test("nested 6 level", () => {
    const source = `
      tw.md(tw.hover(tw.focus(tw.active(tw.groupHover(tw.disabled(tw.bgRed500))))))
    `;
    const actual = transformSource(source);
    const expected = "md:hover:focus:active:group-hover:disabled:bg-red-500";
    expect(actual).toBe(expected);
  });

  test("nested 7 level", () => {
    const source = `
      tw.dark(tw.md(tw.hover(tw.focus(tw.active(tw.groupHover(tw.disabled(tw.bgRed500)))))))
    `;
    const actual = transformSource(source);
    const expected = "dark:md:hover:focus:active:group-hover:disabled:bg-red-500";
    expect(actual).toBe(expected);
  });
});
