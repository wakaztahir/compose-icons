package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ClockAlarm: ImageVector
    get() {
        if (_clockAlarm != null) {
            return _clockAlarm!!
        }
        _clockAlarm = Builder(name = "ClockAlarm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1034f, 3.4763f)
                curveTo(8.3706f, 2.5763f, 7.253f, 2.0f, 6.0f, 2.0f)
                curveTo(3.7909f, 2.0f, 2.0f, 3.7909f, 2.0f, 6.0f)
                curveTo(2.0f, 7.253f, 2.5764f, 8.3707f, 3.4763f, 9.1034f)
                curveTo(3.1675f, 10.0124f, 3.0f, 10.9866f, 3.0f, 12.0f)
                curveTo(3.0f, 14.2153f, 3.8004f, 16.2436f, 5.1277f, 17.8116f)
                lineTo(3.2197f, 19.7197f)
                curveTo(2.9268f, 20.0126f, 2.9268f, 20.4874f, 3.2197f, 20.7803f)
                curveTo(3.5126f, 21.0732f, 3.9874f, 21.0732f, 4.2803f, 20.7803f)
                lineTo(6.1884f, 18.8723f)
                curveTo(7.7564f, 20.1996f, 9.7847f, 21.0f, 12.0f, 21.0f)
                curveTo(14.2153f, 21.0f, 16.2436f, 20.1996f, 17.8116f, 18.8723f)
                lineTo(19.7197f, 20.7803f)
                curveTo(20.0126f, 21.0732f, 20.4874f, 21.0732f, 20.7803f, 20.7803f)
                curveTo(21.0732f, 20.4874f, 21.0732f, 20.0126f, 20.7803f, 19.7197f)
                lineTo(18.8723f, 17.8116f)
                curveTo(20.1996f, 16.2436f, 21.0f, 14.2153f, 21.0f, 12.0f)
                curveTo(21.0f, 10.9866f, 20.8325f, 10.0124f, 20.5237f, 9.1035f)
                curveTo(21.4237f, 8.3707f, 22.0001f, 7.253f, 22.0001f, 6.0f)
                curveTo(22.0001f, 3.7909f, 20.2092f, 2.0f, 18.0001f, 2.0f)
                curveTo(16.7471f, 2.0f, 15.6294f, 2.5763f, 14.8967f, 3.4763f)
                curveTo(13.9877f, 3.1675f, 13.0134f, 3.0f, 12.0f, 3.0f)
                curveTo(10.9866f, 3.0f, 10.0124f, 3.1675f, 9.1034f, 3.4763f)
                close()
                moveTo(6.0f, 3.5f)
                curveTo(6.631f, 3.5f, 7.2078f, 3.7336f, 7.6483f, 4.1201f)
                curveTo(6.1663f, 4.9403f, 4.9403f, 6.1663f, 4.1201f, 7.6483f)
                curveTo(3.7336f, 7.2078f, 3.5f, 6.631f, 3.5f, 6.0f)
                curveTo(3.5f, 4.6193f, 4.6193f, 3.5f, 6.0f, 3.5f)
                close()
                moveTo(16.3518f, 4.1202f)
                curveTo(16.7922f, 3.7336f, 17.3691f, 3.5f, 18.0001f, 3.5f)
                curveTo(19.3808f, 3.5f, 20.5001f, 4.6193f, 20.5001f, 6.0f)
                curveTo(20.5001f, 6.631f, 20.2665f, 7.2079f, 19.8799f, 7.6483f)
                curveTo(19.0598f, 6.1664f, 17.8337f, 4.9403f, 16.3518f, 4.1202f)
                close()
                moveTo(11.25f, 7.0f)
                curveTo(11.6642f, 7.0f, 12.0f, 7.3358f, 12.0f, 7.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.75f)
                curveTo(15.1642f, 12.0f, 15.5f, 12.3358f, 15.5f, 12.75f)
                curveTo(15.5f, 13.1642f, 15.1642f, 13.5f, 14.75f, 13.5f)
                horizontalLineTo(11.25f)
                curveTo(10.8358f, 13.5f, 10.5f, 13.1642f, 10.5f, 12.75f)
                verticalLineTo(7.75f)
                curveTo(10.5f, 7.3358f, 10.8358f, 7.0f, 11.25f, 7.0f)
                close()
            }
        }
        .build()
        return _clockAlarm!!
    }

private var _clockAlarm: ImageVector? = null